package src.java.com.patricia.noteme.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PartageSlimDto {
    private int id;

    private String lien;

    private Date dateExpiration;

}
