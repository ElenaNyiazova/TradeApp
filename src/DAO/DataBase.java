package DAO;

import Model.Account;
import Model.Bid;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataBase {
    List<Bid> bids;
    List<Account> accounts;

    public DataBase(){//todo create singleton?
        Bid amzn = new Bid(1L, 1L, "AMZN", 0,0);
        Bid googl = new Bid(2L, 1L, "GOOGL", 0,0);
        Bid apls = new Bid(3L, 1L, "APLS", 0,0);
        Bid dell = new Bid(4L, 1L, "DELL", 0,0);
        Bid aapl = new Bid(5L, 1L, "AAPL", 0,0);

        bids = Arrays.asList(amzn, googl, apls, dell, aapl);

        Account user1 = new Account(1L, "user1");
        Account user2 = new Account(2L, "user2");
        Account user3 = new Account(3L, "user3");
    }

    public Object[][] getUserData(Long accountId){
        Object[][] data = {{1, "GOOGL", 3, 1.6}, {2, "AAPL", 5, 48.4}};
//                new Object[2][4];
//        data[1][0] = 1;
//        data[1][1] = "GOOGL";
//        data[1][2] = 3;
//        data[1][3] = 1.6;
//        int i=-1;
//        int y=-1;
//        //bids.stream().forEach(bid -> bid.getAccountId() == UserId ? data[i+1][y+1]:).;
//        for(Bid bid :bids){
//            if(bid.getAccountId() == UserId){
//                i++;
//
//                data[]
//            }
//        }

        return data;
    }
}
