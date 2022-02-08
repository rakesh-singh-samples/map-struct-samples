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

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.ReportingPolicy;
import sample.mapstruct.model.HistoryDynamo;
import sample.mapstruct.model.dto.History;

@Mapper(
    componentModel = "spring",
    unmappedTargetPolicy = ReportingPolicy.WARN,
    injectionStrategy = InjectionStrategy.CONSTRUCTOR,
    nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL,
    uses = {IdentifierMapper.class})
public interface HistoryMapper {

  @Mappings({
    @Mapping(source = "identifier", target = "identifier", qualifiedByName = "toIdentifierDynamo"),
    @Mapping(source = "method", target = "method"),
    @Mapping(source = "reason", target = "reason"),
    @Mapping(source = "submitTime", target = "submitTime")
  })
  HistoryDynamo toHistoryDynamo(History history);
}
