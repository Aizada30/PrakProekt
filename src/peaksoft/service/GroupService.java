package peaksoft.service;

import peaksoft.model.Group;

public interface GroupService {


    Group[] saveGroup(Long companyId, Group...groups);

    Group getById(Long id);

    Group [] getAllGroupByCompany(Long conpanyId);

    Group updateGroupByName(String name,Group group);

    String deleteGroupByCompanyId(Long companyId, Long groupId);

}
