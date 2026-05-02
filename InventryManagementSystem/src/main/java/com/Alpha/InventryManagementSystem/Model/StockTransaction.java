package com.Alpha.InventryManagementSystem.Model;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "stock_transactions")
@Data

public class StockTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    @Enumerated(EnumType.STRING)
    private TransactionType type;

    private Integer quantity;

    private String note;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "performed_by")
    private User performedBy;

    @Column(name = "timestamp")
    
    private LocalDateTime timestamp = LocalDateTime.now();

    public enum TransactionType {
        ADD,
        REMOVE,
        TRANSFER
    }
}