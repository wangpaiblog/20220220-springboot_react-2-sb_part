package org.wangpai.demo.springboot4react;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class StaticPathConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        /**
         * 注意：
         * 此处 .addResourceLocations 的参数中，文件路径不要用反斜杠 \\，就用斜杠 / 即可。
         * 另外，路径应以斜杠 / 结尾
         *
         * .addResourceHandler 的参数为 URL 中的基路径，
         * .addResourceLocations 的参数为文件路径中的基路径。
         * 即对于 registry.addResourceHandler("/local/**")
         *               .addResourceLocations("file:C:/Program Files/Nginx/nginx-1.21.6/html/")
         * 如果 URL 为 http://域名:端口号/local/index.html
         * 则对应的文件路径为 C:/Program Files/Nginx/nginx-1.21.6/html/index.html
         */
        registry.addResourceHandler("/local/**")
                .addResourceLocations("file:C:/Program Files/Nginx/nginx-1.21.6/html/");
    }
}
