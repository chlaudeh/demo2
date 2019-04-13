package com.example.demo.controller;


import com.example.demo.model.Account;
import com.example.demo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    List<Account> accountList = new ArrayList<Account>();

    @Autowired
    AccountRepository accountRepository;


    @GetMapping("/getAccountList")
    public List<Account> getAcountList(){
        // return accountList;
        return accountRepository.findAll();

    }



    @GetMapping("/makeAcount")
    public void makeAcount(){
        Account account;
        account = new Account();

        account.setName("md");
        account.setEmail("chlaudeh@naver.com");
        account.setPw("0000");

        System.out.printf(account.getName());

        accountRepository.save(account);
        //저장하고 싶으면 레파지토리 구문을 작성할수잇게 오토와이어드 구문을 사용해야 가능하다
        //그러고 나서 어플리케이션 프로퍼티에서 테이블 생성및 삭제 기능을 유지해서 사용할지 아니면 데이터를 남겨놓고
        //나중에 그냥 남겨진데이터대로 둘것인가 전략을 선택한다.

        // acountList.add(acount);



    }

    @GetMapping("/getAccount")
    public Account  getAccount(){
        return accountList.get(0);

    }



}
