//package com.example.diplom.service;
//
//import com.example.diplom.dal.api.GroupDao;
//import com.example.diplom.dal.api.SubjectDao;
//import com.example.diplom.entity.GroupsEntity;
//import com.example.diplom.entity.SubjectEntity;
//import com.example.diplom.exception.GroupException;
//import com.example.diplom.exception.SubjectException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import javax.validation.constraints.NotNull;
//import java.util.Arrays;
//import java.util.List;
//
//@Service
//public class GroupService {
//
//    @Autowired
//    private GroupDao groupDao;
//
//    @Autowired
//    private SubjectDao subjectDao;
//
//    public GroupsEntity addSubjectToGroup(final int groupId, @NotNull final int subjectId) {
//        final GroupsEntity group = groupDao.findById(groupId).get();
//
//        if (group != null) {
//            return groupDao.save(addSubjectIdToExistsIds(group, subjectId));
//        } else throw new GroupException(String.format("there is not group with id %s", groupId));
//    }
//
//    private GroupsEntity addSubjectIdToExistsIds(final GroupsEntity groupsEntity, final int idToAdd) {
//        final StringBuilder sb = new StringBuilder();
//        final String currentId = groupsEntity.getSubjectId();
//
//        if (validateSubjectId(currentId, idToAdd)) {
//
//            if (currentId.equals("null")) {
//                groupsEntity.setSubjectId(Integer.toString(idToAdd));
//            } else {
//                final String concatId = sb.append(currentId)
//                        .append(" ")
//                        .append(idToAdd)
//                        .toString();
//
//                groupsEntity.setSubjectId(concatId);
//            }
//        } else throw new SubjectException(String.format("There is no subject %s", idToAdd));
//
//        return groupsEntity;
//    }
//
//    private boolean validateSubjectId(final String currentSubjectId, final int subjectId) {
//        return checkIfSubjectExist(subjectId) && checkIfItsAlreadyAssigned(currentSubjectId, subjectId);
//    }
//
//    private boolean checkIfSubjectExist(final int subjectId) {
//        final List<SubjectEntity> subjectEntities = subjectDao.findAll();
//
//        return subjectEntities.stream()
//                .map(SubjectEntity::getId)
//                .anyMatch(id -> id.equals(subjectId));
//    }
//
//    private boolean checkIfItsAlreadyAssigned(final String currentSubjectId, final int subjectId) {
//        final List<String> ids = Arrays.asList(currentSubjectId.split(" "));
//        return ids.stream()
//                .map(Integer::valueOf)
//                .noneMatch(id -> id == subjectId);
//    }
//}
