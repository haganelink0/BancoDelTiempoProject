/*
 * package com.timeBank;
 * 
 * import javax.persistence.Column; import javax.persistence.Entity; import
 * javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
 * import javax.persistence.Id; import javax.persistence.Table;
 * 
 * @Entity
 * 
 * @Table(name="history") public class History {
 * 
 * @Id
 * 
 * @Column(name="Id")
 * 
 * @GeneratedValue(strategy=GenerationType.AUTO, generator="native2") int id;
 * 
 * @Column(name="AlphaUser") private User alphaUser;
 * 
 * @Column(name="BetaUser") private User betaUser;
 * 
 * @Column(name="Service") private Jobs job;
 * 
 * @Column(name="state") private String state; public int getId() { return id; }
 * public void setId(int id) { this.id = id; } public User getAlphaUser() {
 * return alphaUser; } public void setAlphaUser(User alphaUser) { this.alphaUser
 * = alphaUser; } public User getBetaUser() { return betaUser; } public void
 * setBetaUser(User betaUser) { this.betaUser = betaUser; } public Jobs getJob()
 * { return job; } public void setJob(Jobs job) { this.job = job; } public
 * String getState() { return state; } public void setState(String state) {
 * this.state = state; } public History(int id, User alphaUser, User betaUser,
 * Jobs job, String state) { super(); this.id = id; this.alphaUser = alphaUser;
 * this.betaUser = betaUser; this.job = job; this.state = state; } public
 * History(int id) { super(); this.id = id; } public History() { super(); }
 * 
 * 
 * 
 * }
 */