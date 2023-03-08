package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_sequence")
    @SequenceGenerator(name = "order_sequence", sequenceName = "order_seq", allocationSize = 1)
    private Long id;
    @Column(name = "sender's city",nullable = false)
    private String senderCity;
    @Column(name = "sender's address",nullable = false)
    private String senderAddress;
    @Column(name = "recipient's city",nullable = false)
    private String recipientsCity;
    @Column(name = "recipient's address",nullable = false)
    private String recipientsAddress;
    @Column(name = "weight",nullable = false)
    private double weight;
    @Column(name = "date_of_cargo_pickup",nullable = false)
    private Timestamp dateOfCargoPickup;
}
