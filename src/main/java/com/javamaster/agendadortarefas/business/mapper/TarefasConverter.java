package com.javamaster.agendadortarefas.business.mapper;

import com.javamaster.agendadortarefas.business.dto.TarefasDTO;
import com.javamaster.agendadortarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface TarefasConverter {

    TarefasEntity paraTarefaEntity(TarefasDTO dto);

    TarefasDTO paraTarefaDTO(TarefasEntity entity);
}
