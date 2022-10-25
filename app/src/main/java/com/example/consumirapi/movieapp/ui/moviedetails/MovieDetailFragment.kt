package com.example.consumirapi.movieapp.ui.moviedetails

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.consumirapi.R
import com.example.consumirapi.databinding.FragmentMovieDetailBinding
import com.example.consumirapi.movieapp.application.AppConstants

class MovieDetailFragment : Fragment(R.layout.fragment_movie_detail) {

    private lateinit var binding : FragmentMovieDetailBinding
    private val args by navArgs<MovieDetailFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMovieDetailBinding.bind(view)
        with(binding){
            Glide.with(requireContext()).load("${AppConstants.BASE_URL_IMAGE}/${args.posterImageUrl}").centerCrop().into(imgMovie)
            Glide.with(requireContext()).load("${AppConstants.BASE_URL_IMAGE}/${args.backgroundImageUrl}").centerCrop().into(imgBackground)
            txtDescription.text = args.overview
            txtMovieTitle.text = args.title
            txtLanguage.text = args.language
            txtRating.text = "${args.voteAverage} (${args.voteCount} Reviews)"
            txtReleased.text = "Released ${args.releaseDate}"
        }
    }

}