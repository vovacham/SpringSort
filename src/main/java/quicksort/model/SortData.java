package quicksort.model;

import javax.persistence.*;
import java.util.concurrent.atomic.AtomicInteger;

@Entity
@Table(name = "tab", schema = "public", catalog = "test")
public class SortData {
    private static final AtomicInteger AUTO_ID = new AtomicInteger(1);

    @Id
    private int id;
    @Column(name="mestype")
    private String mesType;
    private String mes1;
    private String mes2;

    public SortData(String mesType, String mes1, String mes2) {
        this.id = AUTO_ID.getAndIncrement();
        this.mesType = mesType;
        this.mes1 = mes1;
        this.mes2 = mes2;

    }

    public SortData() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMesType() {
        return mesType;
    }

    public void setMesType(String mestype) {
        this.mesType = mestype;
    }

    public String getMes1() {
        return mes1;
    }

    public void setMes1(String mes1) {
        this.mes1 = mes1;
    }

    public String getMes2() {
        return mes2;
    }

    public void setMes2(String mes2) {
        this.mes2 = mes2;
    }

}
