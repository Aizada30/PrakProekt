package peaksoft.service.serviceImpl;

import peaksoft.model.Company;
import peaksoft.model.Group;
import peaksoft.service.GroupService;

public class GroupServiceimpl implements GroupService{



    public GroupServiceimpl( ){

    }


    @Override
    public Group[] saveGroup(Long companyId, Group...group) {


        return null;
    }

    @Override
    public Group getById(Long id) {

        return null;
    }

    @Override
    public Group[] getAllGroupByCompany(Long conpanyId) {
        return new Group[0];
    }

    @Override
    public Group updateGroupByName(String name, Group group) {
        return null;
    }

    @Override
    public String deleteGroupByCompanyId(Long companyId, Long groupId) {
        return null;
    }
}
