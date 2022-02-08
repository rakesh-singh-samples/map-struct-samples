package sample.mapstruct.model;

import java.io.Serializable;
import java.time.LocalDate;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
public class Identifier implements Serializable {

  /** Comment for <code>serialVersionUID</code> */
  private static final long serialVersionUID = 1L;

  private String number;

  @NonNull private String cityCode;

  @NonNull private String countryCode;

  private LocalDate mydate;
}
