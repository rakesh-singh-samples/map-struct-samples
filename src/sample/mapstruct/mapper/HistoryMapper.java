/*
 * @(#)sample.mapstruct.mapper.HistoryMapper.java
 * ===========================================================================
 * This source code is exclusive propriety of the SPF Finances.
 * In no case are the contents allowed to be distributed to third parties or made public
 * without prior and written consent of SPF Finances.
 * ===========================================================================
 *
 */
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
