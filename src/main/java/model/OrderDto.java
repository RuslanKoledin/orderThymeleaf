package model;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class OrderDto {
    private int id;
    private String senderCity;
    private String senderAddress;
    private String recipientsCity;
    private String recipientsAddress;
    private double weight;
    private Timestamp dateOfCargoPickup;
}
