package quicksort.model;

import javax.persistence.*;
import java.util.concurrent.atomic.AtomicInteger;

@Entity
@Table(name = "tab", schema = "public", catalog = "test")
public class SortData {
    private static final AtomicInteger AUTO_ID = new AtomicInteger(0);
    private int id;
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

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "mestype", nullable = true, length = -1)
    public String getMesType() {
        return mesType;
    }

    public void setMesType(String mestype) {
        this.mesType = mestype;
    }

    @Basic
    @Column(name = "mes1", nullable = true, length = -1)
    public String getMes1() {
        return mes1;
    }

    public void setMes1(String mes1) {
        this.mes1 = mes1;
    }

    @Basic
    @Column(name = "mes2", nullable = true, length = -1)
    public String getMes2() {
        return mes2;
    }

    public void setMes2(String mes2) {
        this.mes2 = mes2;
    }

}
