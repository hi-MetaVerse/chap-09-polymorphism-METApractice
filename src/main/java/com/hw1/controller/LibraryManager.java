package com.hw1.controller;

import com.hw1.model.dto.AniBook;
import com.hw1.model.dto.Book;
import com.hw1.model.dto.CookBook;
import com.hw1.model.dto.Member;
import com.hw1.view.LibraryMenu;

public class LibraryManager {
    private Member mem = null;
    private Book[] bList = new Book[5];
    {
        bList[0] = new CookBook("백종원의 집밮", "백종원", "tvN", true);
        bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
        bList[2] = new AniBook("백종원의 집밮", "백종원", "tvN", true);
        bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
        bList[4] = new CookBook("최현석의 날 따라해봐", "최현석", "소금책", true);
    }
    public void insertMember(Member mem(){

    }














    public Member myInfo(){

    }

    public Book[] selectAll(){
        return bList;
    }

    public book[] searchBook(String keyword){

    }

    public int rentBook(int index) {

    }

