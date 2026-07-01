package com.handson.backend.Model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "student")
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(nullable = false, updatable = false)
    private Date createdAt = new Date();

    @NotEmpty
    @Length(max = 60)
    private String fullname;

    @Min(100)
    @Max(800)
    private Integer satScore;

    @Min(30)
    @Max(110)
    private Double graduationScore;

    @Length(max = 20)
    private String phone;

    @Length(max = 500)
    private String profilePicture;

    public Student() {
    }

    public Student(Long id, Date createdAt, String fullname, Integer satScore, Double graduationScore, String phone, String profilePicture) {
        this.id = id;
        this.createdAt = createdAt != null ? createdAt : new Date();
        this.fullname = fullname;
        this.satScore = satScore;
        this.graduationScore = graduationScore;
        this.phone = phone;
        this.profilePicture = profilePicture;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Integer getSatScore() {
        return satScore;
    }

    public void setSatScore(Integer satScore) {
        this.satScore = satScore;
    }

    public Double getGraduationScore() {
        return graduationScore;
    }

    public void setGraduationScore(Double graduationScore) {
        this.graduationScore = graduationScore;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Long id;
        private Date createdAt;
        private String fullname;
        private Integer satScore;
        private Double graduationScore;
        private String phone;
        private String profilePicture;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder createdAt(Date createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder fullname(String fullname) {
            this.fullname = fullname;
            return this;
        }

        public Builder satScore(Integer satScore) {
            this.satScore = satScore;
            return this;
        }

        public Builder graduationScore(Double graduationScore) {
            this.graduationScore = graduationScore;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder profilePicture(String profilePicture) {
            this.profilePicture = profilePicture;
            return this;
        }

        public Student build() {
            return new Student(id, createdAt != null ? createdAt : new Date(), fullname, satScore, graduationScore, phone, profilePicture);
        }
    }
}
