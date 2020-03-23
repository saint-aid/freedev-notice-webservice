package com.rinomari.dev.springboot.config.auth.dto;

import com.rinomari.dev.springboot.domain.user.Role;
import com.rinomari.dev.springboot.domain.user.User;
import lombok.Builder;
import lombok.Getter;

import java.util.Map;

@Getter
public class OAuthAttributes {
    private Map<String, Object> attributes;
    private String nameAttributekey;
    private String name;
    private String email;
    private String picture;

    @Builder
    public OAuthAttributes(Map<String, Object> attributes, String nameAttributekey,
                           String name, String email, String picture) {
        this.attributes = attributes;
        this.nameAttributekey = nameAttributekey;
        this.name = name;
        this.email = email;
        this.picture = picture;
    }

    public static OAuthAttributes of(String registrationId,String userNameAttributesName,
                                     Map<String, Object> attributes){
        return ofGoogle(userNameAttributesName, attributes);
    }

    private static OAuthAttributes ofGoogle(String userNameAttributesName, Map<String, Object> attributes) {
        return OAuthAttributes.builder()
                .name((String)(attributes.get("name")))
                .email((String)attributes.get("email"))
                .picture((String)attributes.get("picture"))
                .attributes(attributes)
                .nameAttributekey(userNameAttributesName)
                .build();
    }

    public User toEntity(){
        return User.builder()
                .name(name)
                .email(email)
                .picture(picture)
                .role(Role.GUEST)
                .build();
    }
}
