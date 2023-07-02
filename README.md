Below, here  I'm showing the details  related to my Job-Search-Portal project like Framework used  & Language used, Data flow(function used), Data Structure used in my Project and last one is our Summary.

-  ## [*Framework and Language Used :*](#heading-ids) ##
_
- ### Framework :  *SpringBoot*
- ### Language : *Java*


## [*Data Flow*](#heading-ids) ##
_
- ## 1. *Controller :-* ##
> - *@GetMapping :-*  getAllJobs(), getCountJobs(), getAllJobsByJobType(), getAllJobsByGreaterOrEqualSalaryAndJobType(), getAllJobsByCompanyNameAndTypeEqual(), getAllJobsByLocationAndSortedSalaryDesc(), getJobsById(), getAllJobsByLocation()
> - *@PostMapping :-* addJobsList(), addJob()
> - *@PutMapping :-* Not used
> - *@DeleteMapping :-* Not used
> - *[Others Annotaion Used :-](#heading-ids)* @RestController, @Autowired, @PathVariable, @RequestBody,@RequestMapping, @Valid, @RequestParam, @Validated

- ## 2. *Services :-* ##
> - *Method Used :-*  getAllJobs(),addJobsList(), addJob(), getCountJobs(), getAllJobsByJobType(), getAllJobsByGreaterOrEqualSalaryAndJobType(), getAllJobsByCompanyNameAndTypeEqual(), getAllJobsByLocationAndSortedSalaryDesc(), getJobsById(), getAllJobsByLocation()
> - *[Others Annotaion Used :-](#heading-ids)* @Service, @Autowired

- ## 3. *Repository :-* ##
> - *Method Used :-*  findByJobType(), findByJobSalaryGreaterThanEqualAndJobType(), findByCompanyNameAndJobType(), findByJobLocationOrderByJobSalaryDesc(), getJobsById(), getAllJobsByLocation()
> - *[Others Annotaion Used :-](#heading-ids)* @Repository, @Autowired, @Query, @Param

- ## 4. *DataBase Design:-* ##
> - *Database Used :-*  H2 Database

- ## 4. *Model/Entity :-* ##
> - *Validation used :-*  @NotBlank, @NotNull, @Email, @Min, @Max
> - *Annotation Used :-*  @Data, @NoArgsConstructor, @AllArgsConstructor, @Entity, @Id, @Column, @Enumerated, @Table


## [*Data Structure used in my Project*](#heading-ids) ##
__
> - *[Used :-](#heading-ids)* H2 Database--> But Mostly used Java Concept, ENUM, oops, collection

## [*Project Summary*](#heading-ids) ##
__
> - *[Aim :-](#heading-ids)* This is basically good project for learning purpose springboot basics, annotaion, api, spring mvc and CRUD Operation, Validation, H2 Database and JPA. In this project i just add jobs, get jobs by id,get all jobs, add multiple jobs, get jobs by id , a lot of things i learned from this project.

## *[👨‍💻 Rakesh chuadhary](#heading-ids)* ##
__

- Twitter: rakesh.twitter](https://twitter.com/Elite_Rahul)

- Github:https://github.com/rakeshchau144
- 🤝 *Contributing*
_
Contributions, Thanks to everyone , contributing with me and know about more myself [visit my profile](https://www.instagram.com/45_elite/).

*Show Your Support*
_
Give a ⭐if this project helped you!




