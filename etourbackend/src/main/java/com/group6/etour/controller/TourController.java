package com.group6.etour.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.group6.etour.entity.BookingDetails;
import com.group6.etour.entity.BookingHeader;
import com.group6.etour.entity.CategoryMaster;
import com.group6.etour.entity.Customer;
import com.group6.etour.entity.PackageCost;
import com.group6.etour.entity.PackageItinery;
import com.group6.etour.entity.SignUp;
import com.group6.etour.entity.TourDate;
import com.group6.etour.entity.TourPackages;
import com.group6.etour.repository.CategoryMasterDao;
import com.group6.etour.repository.TourPackagesDao;
import com.group6.etour.services.BookingDetailsService;
import com.group6.etour.services.BookingHeaderService;
import com.group6.etour.services.CategoryMasterService;
import com.group6.etour.services.CustomerService;
import com.group6.etour.services.PackageCostService;
import com.group6.etour.services.PackageItineryService;
import com.group6.etour.services.SignUpService;
import com.group6.etour.services.TourDateService;
import com.group6.etour.services.TourPackagesService;




@RestController
public class TourController 
{
	@Autowired
	private CategoryMasterDao categorymasterDao;
	
	
	@Autowired
	private TourPackagesDao tourpackagesDao;
	
	@Autowired
	private CategoryMasterService categorymasterService;
	
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
	
	@PostMapping("/CategoryMaster")
	public CategoryMaster addCategoryMaster(@RequestBody CategoryMaster catmas)
	{
		return this.categorymasterService.addCategoryMaster(catmas);
	}

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
	
	@GetMapping("/GetCategories")
	public List<CategoryMaster> getCategories()
	{
		return this.categorymasterService.getCategories();
	}
	
	@GetMapping("/GetPackages")
	public List<TourPackages> getPackages()
	{
		return this.tourpackagesDao.getPackages();
	}
	
	@GetMapping("/GetSubCategory")
	public List<CategoryMaster> getSubCategory()
	{
		return this.categorymasterDao.getSubCategory();
	}
	
	@GetMapping("/GetSubPackages")
	public List<TourPackages> getSubPackages()
	{
		return this.tourpackagesDao.getSubPackages();
	}
	
}
