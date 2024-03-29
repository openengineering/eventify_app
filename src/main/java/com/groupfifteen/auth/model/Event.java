package com.groupfifteen.auth.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "event")
public class Event {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String name;
		
	private String description;
	
	private String category;
	
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
    private Date startDate;
	
    @DateTimeFormat(pattern ="yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
    private Date endDate;
	
	private Double fee;
	
	private Integer capacity;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "events_owner_users",
		joinColumns = @JoinColumn(name = "event_id", referencedColumnName = "id"),
		inverseJoinColumns = @JoinColumn(name="user_id", referencedColumnName = "id"))
	private Set<User> ownerUsers;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "events_participant_users",
		joinColumns = @JoinColumn(name = "event_id", referencedColumnName = "id"),
		inverseJoinColumns = @JoinColumn(name="user_id", referencedColumnName = "id"))
	private Set<User> participantUsers;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public Set<User> getOwnerUsers() {
		return ownerUsers;
	}

	public void setOwnerUsers(Set<User> ownerUsers) {
		this.ownerUsers = ownerUsers;
	}

	public Set<User> getParticipantUsers() {
		return participantUsers;
	}

	public void setParticipantUsers(Set<User> participantUsers) {
		this.participantUsers = participantUsers;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capacity == null) ? 0 : capacity.hashCode());
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((fee == null) ? 0 : fee.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((ownerUsers == null) ? 0 : ownerUsers.hashCode());
		result = prime * result + ((participantUsers == null) ? 0 : participantUsers.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Event other = (Event) obj;
		if (capacity == null) {
			if (other.capacity != null)
				return false;
		} else if (!capacity.equals(other.capacity))
			return false;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (fee == null) {
			if (other.fee != null)
				return false;
		} else if (!fee.equals(other.fee))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (ownerUsers == null) {
			if (other.ownerUsers != null)
				return false;
		} else if (!ownerUsers.equals(other.ownerUsers))
			return false;
		if (participantUsers == null) {
			if (other.participantUsers != null)
				return false;
		} else if (!participantUsers.equals(other.participantUsers))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		return true;
	}
	
	
}
