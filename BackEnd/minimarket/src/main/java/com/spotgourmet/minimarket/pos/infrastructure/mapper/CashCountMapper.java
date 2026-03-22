package com.spotgourmet.minimarket.pos.infrastructure.mapper;

import com.spotgourmet.minimarket.auth.infrastructure.persistence.mapper.UserMapper;
import com.spotgourmet.minimarket.pos.domain.model.CashCountModel;
import com.spotgourmet.minimarket.pos.infrastructure.entity.CashCount;
import com.spotgourmet.minimarket.pos.infrastructure.entity.CashDenomination;
import com.spotgourmet.minimarket.pos.infrastructure.entity.CheckoutCounterSession;
import org.mapstruct.*;



@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface CashCountMapper {

    @Mapping(target = "sessionId", source = "session.id")
    @Mapping(target = "denominationId", source = "denomination.id")
    @Mapping(target = "createdBy", source = "createdBy", qualifiedByName = "userToShallowModel")
    CashCountModel toModel(CashCount entity);

    @Mapping(target = "session", source = "sessionId", qualifiedByName = "idToSession")
    @Mapping(target = "denomination", source = "denominationId", qualifiedByName = "idToDenomination")
    @Mapping(target = "createdBy", source = "createdBy", qualifiedByName = "modelToShallowUser")
    CashCount toEntity(CashCountModel model);

    @Named("idToSession")
    default CheckoutCounterSession idToSession(Long id) {
        if (id == null) return null;
        CheckoutCounterSession s = new CheckoutCounterSession();
        s.setId(id);
        return s;
    }

    @Named("idToDenomination")
    default CashDenomination idToDenomination(Long id) {
        if (id == null) return null;
        CashDenomination d = new CashDenomination();
        d.setId(id);
        return d;
    }
}
