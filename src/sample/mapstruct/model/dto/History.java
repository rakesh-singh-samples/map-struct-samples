/*
 * @(#)sample.mapstruct.model.History.java
 * ===========================================================================
 * This source code is exclusive propriety of the SPF Finances.
 * In no case are the contents allowed to be distributed to third parties or made public
 * without prior and written consent of SPF Finances.
 * ===========================================================================
 *
 */
package sample.mapstruct.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.ZonedDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class History {

  @JsonProperty("identifier")
  private final Identifier identifier;

  @JsonProperty("submitTime")
  private final ZonedDateTime submitTime;

  @JsonProperty("method")
  private final String method;

  @JsonProperty("reason")
  private final String reason;

  @JsonProperty("dataList")
  private final List<String> dataList;
}
