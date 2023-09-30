package com.qa.pojo;



import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Datum {
	  public int id;
	    public String flightName;
	    @JsonProperty("Country") 
	    public String country;
	    @JsonProperty("Destinations") 
	    public String destinations;
	    @JsonProperty("URL") 
	    public String uRL;
	}


