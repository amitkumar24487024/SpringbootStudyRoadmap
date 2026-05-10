# AGENTS.md - SpringBootStudyRoadmap

## Architecture Overview
- **Layered Architecture**: Follows Spring Boot MVC pattern with clear separation: `controller` → `service` → `repository` → `entity`.
- **Data Layer**: JPA entities in `entity/` package, repositories in `repository/` extending `JpaRepository<MyEntity, Long>`.
- **Business Logic**: Services in `service/` handle logic, injected via constructor `@Autowired`.
- **API Layer**: REST controllers in `controller/` with `@RestController`, base path `/api`, using `ResponseEntity` for responses.
- **Configuration**: Centralized in `src/main/resources/application.yaml` (MySQL datasource, JPA settings).

## Key Patterns & Conventions
- **Dependency Injection**: Use constructor injection with `@Autowired` (e.g., `UserService(UserRepository repo)`).
- **Entities**: Use Lombok `@Data` and `@ToString` for boilerplate; table names lowercase plural (e.g., `@Table(name = "users")`).
- **Logging**: Controllers use `@Slf4j` for logging (e.g., `log.info("Fetching all users")`).
- **Package Structure**: `com.study.roadmap.{controller,service,repository,entity}`.
- **JPA**: `ddl-auto: update` for schema evolution; `show-sql: true` for debugging queries.

## Developer Workflows
- **Build & Run**: Use `./gradlew bootRun` to start app; `./gradlew build` for JAR.
- **Database**: Remote MySQL at `jdbc:mysql://34.93.242.179:3306/springroadmap`; credentials in `application.yaml`.
- **Testing**: JUnit 5 via `testImplementation 'org.springframework.boot:spring-boot-starter-webmvc-test'`.
- **Dependencies**: Managed via Gradle; key starters: `spring-boot-starter-webmvc`, `spring-boot-starter-data-jpa`.

## Examples
- **Adding Entity**: Create class in `entity/` with `@Entity`, `@Table`, `@Id @GeneratedValue(strategy = GenerationType.IDENTITY)`.
- **Repository**: Interface in `repository/` extending `JpaRepository<Entity, Long>` (no custom methods yet).
- **Service**: Class in `service/` with injected repository; methods like `List<Entity> getAll() { return repo.findAll(); }`.
- **Controller**: Class in `controller/` with `@RestController @RequestMapping("/api")`; endpoints like `@GetMapping("/entities")` returning `ResponseEntity<List<Entity>>`.

## Integration Points
- **Database**: MySQL with Hibernate dialect; no migrations, relies on `ddl-auto`.
- **External**: None yet; app name `SpringBootStudyRoadmap` for future microservices.</content>
<parameter name="filePath">C:\Users\Amit Kumsr Singh\Documents\Codebase\SpringbootStudyRoadmap\AGENTS.md
