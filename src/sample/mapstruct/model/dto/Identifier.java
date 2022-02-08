package sample.mapstruct.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Identifier implements Serializable {

  /** Comment for <code>serialVersionUID</code> */
  private static final long serialVersionUID = 1L;

  private String number;

  @lombok.NonNull private String city;

  @lombok.NonNull private String country;

  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'Z'")
  @lombok.NonNull
  private LocalDate mydate;
}
