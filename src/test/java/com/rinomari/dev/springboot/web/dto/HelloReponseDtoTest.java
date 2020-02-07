package com.rinomari.dev.springboot.web.dto;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class HelloReponseDtoTest {

    @Test
    public void 롬복_기능_테스트(){
        //given
        String name = "test";
        int amount = 1047;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
