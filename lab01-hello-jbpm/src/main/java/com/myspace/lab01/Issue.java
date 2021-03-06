package com.myspace.lab01;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Issue implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Type")
	@org.kie.api.definition.type.Description("Type of the issue, defined by the enum as \"question\", \"complain\" or \"compliment\".")
	private java.lang.String type;
	@org.kie.api.definition.type.Description("Can be automatically solved by the system.")
	@org.kie.api.definition.type.Label("Auto Solved")
	private java.lang.Boolean automatic;
	@org.kie.api.definition.type.Description("Date the issue was opened")
	@org.kie.api.definition.type.Label("Date Opened")
	private java.util.Date creationDate;
	@org.kie.api.definition.type.Description("Date the issue was closed")
	@org.kie.api.definition.type.Label("Date Closed")
	private java.util.Date endDate;
	@org.kie.api.definition.type.Label("Reporter")
	@org.kie.api.definition.type.Description("lab01.Person who opened the issue")
	private com.myspace.lab01.Person reporter;

	@org.kie.api.definition.type.Description("Solution provided")
	@org.kie.api.definition.type.Label("Solution")
	private java.lang.String solution;

	@org.kie.api.definition.type.Description("Question made by the customer")
	@org.kie.api.definition.type.Label("Question")
	private java.lang.String question;

	@org.kie.api.definition.type.Label(value = "Is the solution helpful?")
	private java.lang.String helpful;

	public Issue() {
	}

	@Override
	public String toString() {
		return "Issue [type=" + type + ", automatic=" + automatic + ", creationDate=" + creationDate + ", endDate="
				+ endDate + ", reporter=" + reporter + ", solution=" + solution + ", question=" + question
				+ ", helpful=" + helpful + "]";
	}

	public java.lang.String getType() {
		return this.type;
	}

	public void setType(java.lang.String type) {
		this.type = type;
	}

	public java.lang.Boolean getAutomatic() {
		return this.automatic;
	}

	public void setAutomatic(java.lang.Boolean automatic) {
		this.automatic = automatic;
	}

	public java.util.Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(java.util.Date creationDate) {
		this.creationDate = creationDate;
	}

	public java.util.Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(java.util.Date endDate) {
		this.endDate = endDate;
	}

	public com.myspace.lab01.Person getReporter() {
		return this.reporter;
	}

	public void setReporter(com.myspace.lab01.Person reporter) {
		this.reporter = reporter;
	}

	public java.lang.String getSolution() {
		return this.solution;
	}

	public void setSolution(java.lang.String solution) {
		this.solution = solution;
	}

	public java.lang.String getQuestion() {
		return this.question;
	}

	public void setQuestion(java.lang.String question) {
		this.question = question;
	}


	public java.lang.String getHelpful() {
		return this.helpful;
	}

	public void setHelpful(java.lang.String helpful) {
		this.helpful = helpful;
	}

	public Issue(java.lang.String type, java.lang.Boolean automatic,
			java.util.Date creationDate, java.util.Date endDate,
			com.myspace.lab01.Person reporter,
			java.lang.String solution, java.lang.String question,
			java.lang.String helpful) {
		this.type = type;
		this.automatic = automatic;
		this.creationDate = creationDate;
		this.endDate = endDate;
		this.reporter = reporter;
		this.solution = solution;
		this.question = question;
		this.helpful = helpful;
	}
	
	
}
