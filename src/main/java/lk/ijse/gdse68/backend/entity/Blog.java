package lk.ijse.gdse68.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

public  class Blog {
    @Id // mark primary key
        private String id;
        private String title;

        private  String category;

        private String content;


}

