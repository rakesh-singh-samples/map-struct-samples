/*
 * @(#)sample.mapstruct.model.HistoryDynamo.java
 * ===========================================================================
 * This source code is exclusive propriety of the SPF Finances.
 * In no case are the contents allowed to be distributed to third parties or made public
 * without prior and written consent of SPF Finances.
 * ===========================================================================
 *
 */
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
