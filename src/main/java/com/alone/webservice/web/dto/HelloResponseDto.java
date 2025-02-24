//package com.alone.webservice.web.dto;
//
//import lombok.Getter;
//import lombok.RequiredArgsConstructor;
//
//@Getter
//@RequiredArgsConstructor
//public class HelloResponseDto {
//
//    private final String name;
//    private final int amount;
////public record HelloResponseDto(String name, int amount) {
//
//}
package com.alone.webservice.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor  // final 필드에 대한 생성자 자동 생성
public class HelloResponseDto {
    private final String name;
    private final int amount;

//    public HelloResponseDto(final String name, final int amount) {
//        this.name = name;
//        this.amount = amount;
//    }
}