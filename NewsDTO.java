package kr.or.smhrd.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class NewsDTO {
    // ���� �Ϸù�ȣ 
    private Double n_no;
    // ��� ���� 
    private String n_title;
    // ��� �ۼ��� 
    private String n_reporter;
    // �ۼ����� 
    private Date created_at;
    // ��� ���� 
    private String n_content;
    // ��� ��ȸ�� 
    private Double n_views;
    // ���� ī�װ� 
    private String n_category;
    // ��� �̹��� 
    private String n_img;
}