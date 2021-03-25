package com.kbk.model;

import java.io.Serializable;

public class ExcellentStudent implements Serializable {
    private Integer id;

    private String image;

    private String position;

    private String name;

    private String description;

    private Integer salary;

    private Long createAt;

    private Long updateAt;

    public ExcellentStudent(Integer id, String image, String position, String name, String description, Integer salary, Long createAt, Long updateAt) {
        this.id = id;
        this.image = image;
        this.position = position;
        this.name = name;
        this.description = description;
        this.salary = salary;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    public ExcellentStudent() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return "excellentStudent{" +
                "id=" + id +
                ", image='" + image + '\'' +
                ", position='" + position + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", salary=" + salary +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                '}';
    }
}