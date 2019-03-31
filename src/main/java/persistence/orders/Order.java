package persistence.orders;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This class is used by Hibernate to map to the Orders table.
 * <p>
 * Orders are persistable however changes are not automatically updated to the database.
 * To persist a {@code Order} you must use the {@link hibernate.HibernateUtil#save(Object)}
 * method.
 *
 * @author Suraj Kumar <a href="mailto:sk551@kent.ac.uk">sk551@kent.ac.uk</a>
 */
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "userId")
    private long userId;

    @Column(name = "address")
    private String address;

    @Column(name = "phoneNumber")
    private String phoneNumber;

    @Column(name = "timeCreated")
    private String timeCreated;

    @Column(name = "delivered")
    private boolean delivered;

    public Order() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(String timeCreated) {
        this.timeCreated = timeCreated;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }
}
