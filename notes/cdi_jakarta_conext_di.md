# Jakarta Contexts & Dependency Injection (CDI)
***
CDI는 규격이고, Spring 프레임워크가 CDI를 구현한다

- Inject
- Named
- Qualifier
- Scope
- Singleton

``` java
//@Component  
@Named  
class BusinessService {  
    private DataService dataService;  
  
//    @Autowired  
    @Inject  
    public void setDataService(DataService dataService) {  
        System.out.println("Setter Injection");  
        this.dataService = dataService;  
    }  
    public DataService getDataService() {  
        return dataService;  
    }  
}  
  
//@Component  
@Named  
class DataService {  
  
}
```

@Component -> @Named
@Autowired -> @Inject