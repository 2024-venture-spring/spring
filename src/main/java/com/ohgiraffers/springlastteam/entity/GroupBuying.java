package com.ohgiraffers.springlastteam.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "group_buying")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class GroupBuying implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "buying_no")
    private int buyingNo;

    @Column(name = "buying_title")
    private String buyingTitle;

    @Column(name = "buying_text")
    private String buyingText;

    @Column(name = "buying_item")
    private String buyingItem;

    @Column(name = "buying_quality")
    private String buyingQuality;

    @Column(name = "buying_price")
    private String buyingPrice;

    @ManyToOne
    @JoinColumn(name = "user_no", nullable = false)
    private Users user;

    public GroupBuying(int buyingNo, String buyingTitle, String buyingText, String buyingItem, String buyingQuality, String buyingPrice, Users user) {
        this.buyingNo = buyingNo;
        this.buyingTitle = buyingTitle;
        this.buyingText = buyingText;
        this.buyingItem = buyingItem;
        this.buyingQuality = buyingQuality;
        this.buyingPrice = buyingPrice;
        this.user = user;
    }
}