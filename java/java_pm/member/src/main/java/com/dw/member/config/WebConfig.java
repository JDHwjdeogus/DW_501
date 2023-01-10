package com.dw.member.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

// Config: 설정 
// Web Config: 웹 설정
@Configuration
public class WebConfig implements WebMvcConfigurer{

    @Value("${aws.s3.access-id}")
    private String accessKey;
    @Value("${aws.s3.access-pw}")
    private String secretKey;

    @Autowired
    Interceptor interceptor;    // 만들어둔 Interceptor 파일 불러오기
    
    // addInterciptors: 인터셉터를 추가하는 함수를 재정의
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        String[] patterns = {"/login", "/error", "/resources/static/*", "/api/v1/login",
        "/api/v1/login-test","/api/v1/image","/upload" };   // 인터셉터 제외 url
        registry.addInterceptor(interceptor).excludePathPatterns(patterns);
    }


    // AWS에서 발급한 key가 맞는지 검사
    @Bean
	public BasicAWSCredentials AwsCredentials() {
		BasicAWSCredentials awsCreds = new BasicAWSCredentials(accessKey, secretKey);
		return awsCreds;
	}


    // AWS 위치 인증 및 체크
	@Bean
	public AmazonS3 AwsS3Client() {

		AmazonS3 s3Builder = AmazonS3ClientBuilder.standard().withRegion(Regions.AP_NORTHEAST_2)
				.withCredentials(new AWSStaticCredentialsProvider(this.AwsCredentials())).build();
		return s3Builder;
	}

}
