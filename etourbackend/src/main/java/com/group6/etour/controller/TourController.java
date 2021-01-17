package com.group6.etour.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.group6.etour.entity.BookingDetails;
import com.group6.etour.entity.BookingHeader;
import com.group6.etour.entity.Customer;
import com.group6.etour.entity.MainCategories;
import com.group6.etour.entity.PackageCost;
import com.group6.etour.entity.PackageItinery;
import com.group6.etour.entity.SignUp;
import com.group6.etour.entity.SubCategories;
import com.group6.etour.entity.TourDate;
import com.group6.etour.entity.TourPackages;
import com.group6.etour.repository.MainCategoriesDao;
import com.group6.etour.repository.SignUpDao;
import com.group6.etour.repository.SubCategoriesDao;
import com.group6.etour.repository.TourPackagesDao;
import com.group6.etour.services.BookingDetailsService;
import com.group6.etour.services.BookingHeaderService;
import com.group6.etour.services.CustomerService;
import com.group6.etour.services.MainCategoriesService;
import com.group6.etour.services.PackageCostService;
import com.group6.etour.services.PackageItineryService;
import com.group6.etour.services.SignUpService;
import com.group6.etour.services.SubCategoriesService;
import com.group6.etour.services.TourDateService;
import com.group6.etour.services.TourPackagesService;




@RestController
public class TourController 
{
	
	@Autowired
	private SubCategoriesDao subcategoriesDao ;
	
	@Autowired
	private MainCategoriesDao maincategoriesDao ;
	
	@Autowired
	private SignUpDao signupDao;
	
	@Autowired
	private TourPackagesDao tourpackagesDao;
	
	@Autowired
	private MainCategoriesService maincategoriesService;
	
	@Autowired
	private SubCategoriesService subcategoriesService;
	
	@Autowired
	private TourPackagesService tourpackagesService;
	
	@Autowired
	private PackageCostService packcostService;
	
	@Autowired
	private PackageItineryService packitineryService;
	
	@Autowired
	private TourDateService tourdateService;
	
	@Autowired
	private SignUpService signupService;
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private BookingHeaderService bookingheaderService;
	
	@Autowired 
	private BookingDetailsService bookingdetailsService;
	
	
	
	
	@PostMapping("/TourPackages")
	public TourPackages addTourPackages(@RequestBody TourPackages tourpack)
	{
		return this.tourpackagesService.addTourPackages(tourpack);
	}

	@PostMapping("/PackageCost")
	public PackageCost addPackageCost(@RequestBody PackageCost packcost)
	{
		return this.packcostService.addPackageCost(packcost);
	}
	
	@PostMapping("/PackageItinery")
	public PackageItinery addPackageItinery(@RequestBody PackageItinery packitin)
	{
		return this.packitineryService.addPackageItinery(packitin);
	}
	
	@PostMapping("/TourDate")
	public TourDate addTourDate(@RequestBody TourDate tourdate)
	{
		return this.tourdateService.addTourDate(tourdate);
	}
	
	@PostMapping("/SignUp")
	public SignUp addSignUp(@RequestBody SignUp signup)
	{
		return this.signupService.addSignUp(signup);
	}
	
	@PostMapping("/Customer")
	public Customer addCustomer(@RequestBody Customer customer)
	{
		return this.customerService.addCustomer(customer);
		
	}
	
	@PostMapping("/BookingHeader")
	public BookingHeader addBookingHeader(@RequestBody BookingHeader bookhead)
	{
		return this.bookingheaderService.addBookingHeader(bookhead);
	}
	
	@PostMapping("/BookingDetails")
	public BookingDetails addBookDetails(@RequestBody BookingDetails bookdetails)
	{
		return this.bookingdetailsService.addBookingDetails(bookdetails);
	}
	
	@PostMapping("/MainCategories")
	public MainCategories addMainCategory(@RequestBody MainCategories maincategory) 
	{
		return this.maincategoriesService.addMainCategory(maincategory);
	}
	
	@PostMapping("/SubCategories")
	public SubCategories addSubCategory(@RequestBody SubCategories subcategory) 
	{
		return this.subcategoriesService.addSubCategory(subcategory);
	}
	
	@PostMapping("/Login/{email_id}&{password}")
	public SignUp authenticate(@PathVariable String email_id, @PathVariable String password) 
	{
		return this.signupDao.authenticate(email_id, password);
	}
	
	
	@GetMapping("/GetPackages")
	public List<TourPackages> getPackages()
	{
		return this.tourpackagesDao.getPackages();
	}
	
	@GetMapping("/maincategories")
	public List<MainCategories> getMainCategories()
	{
		return this.maincategoriesDao.getMainCategories();
	}
	@GetMapping("/kashmirsub")
	public List<Object[]> getkashmirsubpackages()
	{
		return this.tourpackagesDao.getkashmirsubpackages();
	}
	
	@GetMapping("/subcategories")
	public List<Object> getSubCategories()
	{
		return this.subcategoriesDao.getSubCategories();
	}
	
	@GetMapping("/chardhamsub")
	public List<Object[]> getchardhamsubpackages()
	{
		return this.tourpackagesDao.getchardhamsubpackages();
	}
}
