/*
 * @(#)sample.mapstruct.mapper.IdentifierMapper.java
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
import sample.mapstruct.model.dto.Identifier;

@Mapper(
    componentModel = "spring",
    unmappedTargetPolicy = ReportingPolicy.WARN,
    injectionStrategy = InjectionStrategy.CONSTRUCTOR,
    nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL)
public interface IdentifierMapper {

  @Mappings({
    @Mapping(source = "identifier.number", target = "number"),
    @Mapping(source = "identifier.city", target = "cityCode"),
    @Mapping(source = "identifier.country", target = "countryCode"),
    @Mapping(source = "identifier.mydate", target = "mydate")
  })
  sample.mapstruct.model.Identifier toIdentifierDynamo(Identifier identifier);
}
