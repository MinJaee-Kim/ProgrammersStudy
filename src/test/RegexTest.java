package test;

public class RegexTest {
    //그룹 또는 Ranges
    //| 또는
    //() 그룹
    //gr(e|a)y gr로 시작하면서 e또는a를 문자열을 가지고있고 y로 끝나는 문자
    //(?:) 그룹을 기억하지 않음
    //[] 괄호안의 어떤문자든 [a-f] a~f까지 [abcdf] abcdf를 포함
    //[a-zA-Z0-9] 소문, 대문, 숫자
    //[^a-zA-Z0-9] 소문, 대문, 숫자를 포함 안함
    //[^]부정 문자셋


    //Quantifiers
    //? 없거나 있거나 gra?y -> gry, gray
    //* 없거나 있거나 많거나  gra*y-> graaaay
    //+ 하나 또는 많이
    //{n} n번 반복
    //{min,} 최소
    //{min,max} 최소, 그리고 최대

    //Boundary-type
    // \b 단어 경계 단어의 앞에서 쓰이는 문자만
    // \B 단어 경계가 아닌것
    // ^단어의 시작
    // $단어의 끝
    
    //Chaaracter classes
    // \특수문자가 아닌 문자
    // .어떤 글자 (줄바꿈 제외)
    // \d 모든 숫자
    // \D 모든 숫자 아닌거
    // \w word 문자
    // \W word 문자 아닌거
    // \s space 공백
    // \S space 가 아닌거
    
    // \d{2,3}[-. ]\d{3}[-. ]\d{3,4} 전화번호 예시
    // [a-zA-Z0-9._+-]+@[a-zA-Z0-9._+-]+\.[a-zA-Z0-9._+-]+ 이메일 예시
    // (?:https?:\/\/)?(?:www.)?youtu.be\/([a-zA-Z0-9\-]+) 유튜브 로 시작되는 토큰 주소
}
