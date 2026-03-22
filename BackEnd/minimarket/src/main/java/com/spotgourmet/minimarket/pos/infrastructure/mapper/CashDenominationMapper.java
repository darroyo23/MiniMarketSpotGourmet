package com.spotgourmet.minimarket.pos.infrastructure.mapper;

import com.spotgourmet.minimarket.pos.domain.model.CashDenominationModel;
import com.spotgourmet.minimarket.pos.infrastructure.entity.CashDenomination;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CashDenominationMapper {

    CashDenominationModel toModel(CashDenomination entity);

    CashDenomination toEntity(CashDenominationModel model);
}
