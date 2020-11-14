package model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document("city")
public class City {

    private String name;
    private int population;

}
