package br.com.app.horadorango.domains;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Menu {
    private Integer id;
    private String item;
    private Double price;
}
