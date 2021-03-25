package com.kbk.model;

import java.io.Serializable;

public class Profession implements Serializable {
    private Integer id;

    private String image;

    private String developmentDirection;

    private String professionName;

    private String description;

    private Integer limitCondition;

    private Integer difficulty;

    private String growthCycle;

    private Integer salaryStart;

    private Integer salaryEnd;

    private Integer scarcity;

    private Integer numberOfStudent;

    private Integer employedPopulation;

    private String prompt;

    private Long createAt;

    private Long updateAt;

    public Profession(Integer id, String image, String developmentDirection, String professionName, String description, Integer limitCondition, Integer difficulty, String growthCycle, Integer salaryStart, Integer salaryEnd, Integer scarcity, Integer numberOfStudent, Integer employedPopulation, String prompt, Long createAt, Long updateAt) {
        this.id = id;
        this.image = image;
        this.developmentDirection = developmentDirection;
        this.professionName = professionName;
        this.description = description;
        this.limitCondition = limitCondition;
        this.difficulty = difficulty;
        this.growthCycle = growthCycle;
        this.salaryStart = salaryStart;
        this.salaryEnd = salaryEnd;
        this.scarcity = scarcity;
        this.numberOfStudent = numberOfStudent;
        this.employedPopulation = employedPopulation;
        this.prompt = prompt;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    public Profession() {
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

    public String getDevelopmentDirection() {
        return developmentDirection;
    }

    public void setDevelopmentDirection(String developmentDirection) {
        this.developmentDirection = developmentDirection == null ? null : developmentDirection.trim();
    }

    public String getProfessionName() {
        return professionName;
    }

    public void setProfessionName(String professionName) {
        this.professionName = professionName == null ? null : professionName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getLimitCondition() {
        return limitCondition;
    }

    public void setLimitCondition(Integer limitCondition) {
        this.limitCondition = limitCondition;
    }

    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    public String getGrowthCycle() {
        return growthCycle;
    }

    public void setGrowthCycle(String growthCycle) {
        this.growthCycle = growthCycle == null ? null : growthCycle.trim();
    }

    public Integer getSalaryStart() {
        return salaryStart;
    }

    public void setSalaryStart(Integer salaryStart) {
        this.salaryStart = salaryStart;
    }

    public Integer getSalaryEnd() {
        return salaryEnd;
    }

    public void setSalaryEnd(Integer salaryEnd) {
        this.salaryEnd = salaryEnd;
    }

    public Integer getScarcity() {
        return scarcity;
    }

    public void setScarcity(Integer scarcity) {
        this.scarcity = scarcity;
    }

    public Integer getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(Integer numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    public Integer getEmployedPopulation() {
        return employedPopulation;
    }

    public void setEmployedPopulation(Integer employedPopulation) {
        this.employedPopulation = employedPopulation;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt == null ? null : prompt.trim();
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
        return "Profession{" +
                "id=" + id +
                ", image='" + image + '\'' +
                ", developmentDirection='" + developmentDirection + '\'' +
                ", professionName='" + professionName + '\'' +
                ", description='" + description + '\'' +
                ", limitCondition=" + limitCondition +
                ", difficulty=" + difficulty +
                ", growthCycle='" + growthCycle + '\'' +
                ", salaryStart=" + salaryStart +
                ", salaryEnd=" + salaryEnd +
                ", scarcity=" + scarcity +
                ", numberOfStudent=" + numberOfStudent +
                ", employedPopulation=" + employedPopulation +
                ", prompt='" + prompt + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                '}';
    }
}