package com.kbstar.dto;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class Item {

  private String name;
  private String position;
  private String Office;
  private int age;
  private Date startDate;
  private int salary;
}

