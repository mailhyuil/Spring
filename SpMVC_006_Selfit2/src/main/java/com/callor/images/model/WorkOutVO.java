package com.callor.images.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WorkOutVO {
	private String sl_id;
	private String sl_scid;
	private String sl_listid;
	private String sl_listname;
	private String sl_set;
	private String sl_weight;
	private String sl_rep;
}
