package br.com.app.horadorango.domains;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class Place {
    private Integer id;
    private String name;
    private String kindOfFood;
    private String image;
    private String phone;
    private String address;
    private List<Menu> menu;
}
