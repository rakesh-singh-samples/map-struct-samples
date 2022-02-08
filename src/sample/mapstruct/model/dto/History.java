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
