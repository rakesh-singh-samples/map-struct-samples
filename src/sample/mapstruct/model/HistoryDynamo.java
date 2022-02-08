package sample.mapstruct.model;

import java.time.ZonedDateTime;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
public class HistoryDynamo {
  private ZonedDateTime submitTime;

  @NonNull private Identifier identifier;

  private String method;

  private String reason;

  private List<String> dataList;
}
