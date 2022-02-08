package sample.mapstruct.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import sample.mapstruct.model.HistoryDynamo;
import sample.mapstruct.model.dto.History;

@Mapper(
    componentModel = "spring",
    injectionStrategy = InjectionStrategy.CONSTRUCTOR,
    uses = {IdentifierMapper.class})
public interface HistoryMapper {

  HistoryDynamo toHistoryDynamo(History history);

  @AfterMapping
  default void changeReason(History history) {
    System.out.println(history.getReason());
  }
}
