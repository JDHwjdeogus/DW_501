package com.dw.member.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UploadService {
    
    @Autowired
    private AwsService awsService;

    public boolean uploadImageToAwsS3(MultipartFile[] locationFile){
        String today = new SimpleDateFormat("yyMMdd").format(new Date());
        String imageBasePath="https://idden.io.s3.ap-northeast-2.amazonaws.com";    //디비에 저장할 때 사용, 이미지 서버 주소
        String imagePath = "/upload/"+today;    //이미지를 저장할 폴더
        // 실무에서는 사진 이름을 현재시간(초 단위 까지) 혹은 PK 이름으로 저장한다.
        // 사진 용량도 코딩으로 줄여서 저장한다. (image resize)

        /* 해당 주석이 있는 부분만 for 반복문으로 구현하면 사진을 여러 장 업로드 할 수 있다: 지금은 1장밖에 못하므로 덮어씌우기만 가능 */
        String imageName = "jeongdahyeon"+locationFile[0].getName()+".jpg";
        try{
            awsService.uploadObject(locationFile[0],imagePath,imageName);
            String s3Url = imageBasePath + imagePath + "/" + imageName;
            // s3Url을 DB에 저장하는 로직을 구현하면 끝
        }catch(Exception e){
            return false;
        }

        return true;
        /**/
    }
}

// 업로드 후 AWS S3를 확인해보면 /upload라는 폴더가 생성되어있고 그 안에 이미지가 들어있을 것이다.
// 정확히는 객체 URL이라고 표시되어있는 링크를 확인해보면 된다.
// 나의 경우 https://s3.ap-northeast-2.amazonaws.com/idden.io/upload/230110/jeongdahyeonimage.jpg
// 해당 주소를 DB에 저장하면 이제 구축한 서버에서도 이미지를 확인할 수 있다.