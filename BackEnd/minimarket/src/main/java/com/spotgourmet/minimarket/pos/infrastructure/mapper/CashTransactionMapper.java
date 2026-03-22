package com.spotgourmet.minimarket.pos.infrastructure.mapper;

import com.spotgourmet.minimarket.auth.infrastructure.persistence.mapper.UserMapper;
import com.spotgourmet.minimarket.pos.domain.model.CashTransactionModel;
import com.spotgourmet.minimarket.pos.infrastructure.entity.CashTransaction;
import com.spotgourmet.minimarket.pos.infrastructure.entity.CheckoutCounterSession;
import org.mapstruct.*;



@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface CashTransactionMapper {

    @Mapping(target = "sessionId", source = "session.id")
    @Mapping(target = "createdBy", source = "createdBy", qualifiedByName = "userToShallowModel")
    CashTransactionModel toModel(CashTransaction entity);

    @Mapping(target = "session", source = "sessionId", qualifiedByName = "idToSession")
    @Mapping(target = "createdBy", source = "createdBy", qualifiedByName = "modelToShallowUser")
    CashTransaction toEntity(CashTransactionModel model);

    @Named("idToSession")
    default CheckoutCounterSession idToSession(Long id) {
        if (id == null) return null;
        CheckoutCounterSession s = new CheckoutCounterSession();
        s.setId(id);
        return s;
    }
}
